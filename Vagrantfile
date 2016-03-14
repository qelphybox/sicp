# -*- mode: ruby -*-
# vi: set ft=ruby :

$script = <<SHELL
  echo "StrictHostKeyChecking no" > ~/.ssh/config
  echo "UserKnownHostsFile=/dev/null no" >> ~/.ssh/config
  apt-get install -y software-properties-common git
  apt-add-repository -y ppa:ansible/ansible
  apt-get update && apt-get install -y ansible
SHELL

Vagrant.configure(2) do |config|
  config.ssh.forward_agent = true
  config.vm.box = "ubuntu/trusty64"
  config.vm.box_check_update = false
  config.vm.synced_folder "./", "/home/vagrant/sicp"
  config.vm.provision "shell", inline: $script
  config.vm.provision "ansible_local" do |ansible|
    ansible.playbook = "cm/vagrant.yml"
  end
end
